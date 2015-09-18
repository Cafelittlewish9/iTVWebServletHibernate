package model.vo;

import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Article")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ArticleVO {

	@XmlElement(required = true)
	private int articleId;
	@XmlElement(required = true)
	private int memberId;
	@XmlElement(required = true)
	private String subclassNo;
	@XmlElement(required = true)
	private String articleTitle;
	@XmlElement(required = true)
	private String articleContent;
	@XmlElement(required = true)
	private java.util.Date publishTime;
	@XmlElement(required = true)
	private java.util.Date modifyTime;
	@XmlElement(required = true)
	private long watchTimes;
	@XmlElement(required = true)
	private MemberVO member;
	@XmlElement(required = true)
	private ArticleClassVO articleClass;

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(publishTime);
		return articleId + ": " + articleTitle + " (" + date + ")";
	}

	@Id
	@SequenceGenerator(name = "id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id")
	@Column(name="articleId")
	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	@Column(name="memberId")
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	@Column(name="subclassNo")
	public String getSubclassNo() {
		return subclassNo;
	}

	public void setSubclassNo(String subclassNo) {
		this.subclassNo = subclassNo;
	}
	@Column(name="articleTitle")
	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	@Column(name="articleContent")
	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	@Column(name="publishTime")
	@Temporal(TemporalType.DATE)
	public java.util.Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(java.util.Date publishTime) {
		this.publishTime = publishTime;
	}
	@Column(name="modifyTime")
	@Temporal(TemporalType.DATE)
	public java.util.Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.util.Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	@Column(name="watchTimes")
	public long getWatchTimes() {
		return watchTimes;
	}

	public void setWatchTimes(long watchTimes) {
		this.watchTimes = watchTimes;
	}
	@ManyToOne
	@JoinColumn(name="Member.memberId")
	public MemberVO getMember() {
		return member;
	}

	public void setMember(MemberVO member) {
		this.member = member;
	}

	@ManyToOne
	@JoinColumn(name="ArticleClass.subclassNo")
	public ArticleClassVO getArticleClass() {
		return articleClass;
	}

	public void setArticleClass(ArticleClassVO articleClass) {
		this.articleClass = articleClass;
	}
}
