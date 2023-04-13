package compartir.project.service;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.Upload;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class S3FileUploadService {

    // 버킷 이름 동적 할당
    @Value("${cloud.aws.s3.bucket}")
    private String bucket;

    // 버킷 주소 동적 할당
    @Value("${cloud.aws.s3.bucket.url}")
    private String defaultUrl;

    private final AmazonS3Client amazonS3Client;

    public S3FileUploadService(AmazonS3Client amazonS3Client) {
        this.amazonS3Client = amazonS3Client;
    }
    
    public String uploadPost(MultipartFile uploadFile) throws IOException{
    	String url=defaultUrl+upload(uploadFile,"/post");
    	return url;
    }
    
    public String uploadProfile(MultipartFile uploadFile) throws IOException{
    	String url=defaultUrl+upload(uploadFile,"/profile");
    	return url;
    }
    
    public void fileDelete(String url) {
    	url=url.split(".com/")[1];
        amazonS3Client.deleteObject(new DeleteObjectRequest(bucket, url));
    }

    private String upload(MultipartFile uploadFile,String type) throws IOException {
        String origName = uploadFile.getOriginalFilename();
        if(!origName.isEmpty()) {
        	// 확장자를 찾기 위한 코드
            final String ext = origName.substring(origName.lastIndexOf('.'));
            // 파일이름 암호화
            final String saveFileName = getUuid() + ext;
            // 파일 객체 생성
            // System.getProperty => 시스템 환경에 관한 정보를 얻을 수 있다. (user.dir = 현재 작업 디렉토리를 의미함)
            File file = new File(System.getProperty("user.dir") + saveFileName);
            // 파일 변환
            uploadFile.transferTo(file);
            // S3 파일 업로드
            uploadOnS3(saveFileName, file, type);
            // 파일 삭제
            file.delete();
            // 파일이름 리턴
            return type+"/"+saveFileName;
        }
        return "";
    }
    
    private static String getUuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    private void uploadOnS3(final String findName, final File file, final String type) {
        // AWS S3 전송 객체 생성
        final TransferManager transferManager = new TransferManager(this.amazonS3Client);
        // 요청 객체 생성
        final PutObjectRequest request = new PutObjectRequest(bucket+type, findName, file);
        // 업로드 시도
        final Upload upload =  transferManager.upload(request);

        try {
            upload.waitForCompletion();
        } catch (AmazonClientException amazonClientException) {
            log.error(amazonClientException.getMessage());
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }
}