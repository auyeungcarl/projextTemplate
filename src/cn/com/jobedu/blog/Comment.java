package cn.com.jobedu.blog;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Comment implements java.io.Serializable {
	private static final long serialVersionUID = -3748781028026320660L;
	private Integer id;
	private String username;
	private String content;
	private LocalDateTime createdTime;
	private Integer blogId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getBlogId() {
		return blogId;
	}
	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getCreatedTime() {
		return createdTime;
	}
	public Date getCreatedTimeDate() {
		return Date.from(createdTime.atZone(ZoneId.systemDefault()).toInstant());
	}
	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}
}
