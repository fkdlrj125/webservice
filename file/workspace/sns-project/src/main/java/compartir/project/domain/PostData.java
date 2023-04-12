package compartir.project.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PostData {
	public Long userId;
	public String postImage;
	public String postContent;
	
	public PostData(Long userId ,String url, String postContent) {
		super();
		this.userId = userId;
		this.postImage = url;
		this.postContent = postContent;
	}
	
	public PostData(String url, String postContent) {
		this.postImage = url;
		this.postContent = postContent;
	}
}
