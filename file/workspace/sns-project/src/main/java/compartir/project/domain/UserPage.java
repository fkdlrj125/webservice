package compartir.project.domain;

import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserPage {
	private int total;
	private int currentPage;
	private int totalPages;
	private int startPage;
	private int endPage;
	private int pagingCount;
	private List<User> userContent;
	
	public UserPage(int total, int currentPage, int size, int pagingCount,
			List<User> userContent) {
		this.total = total;
		this.currentPage = currentPage;
		this.pagingCount = pagingCount;
		this.userContent = userContent;
		Collections.reverse(this.userContent);
		
		if(total - ((currentPage-1)*size) > size) {
			this.userContent = userContent.subList((currentPage-1)*size, currentPage*size);
		} else {
			this.userContent = userContent.subList((currentPage-1)*size, total);
		}
		
		if(total == 0) {
			totalPages = 0;
			startPage = 0;
			endPage = 0;
		} else {
			totalPages = total/size;
			if(total % size > 0) {
				totalPages++;
			}
			startPage = currentPage / pagingCount * pagingCount + 1;
			
			if(currentPage % pagingCount == 0) {
				currentPage -= pagingCount;
			}
			
			endPage = startPage + pagingCount - 1;
			if(endPage > totalPages) {
				endPage = totalPages;
			}
		}
	}
}
