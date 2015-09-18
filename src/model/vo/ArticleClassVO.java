package model.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ArticleClass")
// @XmlRootElement
// @XmlAccessorType(XmlAccessType.FIELD)
public class ArticleClassVO implements Serializable {

	// @XmlElement(required = true)
	private String subclassNo;
	// @XmlElement(required = true)
	private String subclassName;
	// @XmlElement(required = true)
	private String className;

	@Override
	public String toString() {
		return subclassNo + ": " + subclassName + " (" + className + ")";
	}

	@Id
	public String getSubclassNo() {
		return subclassNo;
	}

	public void setSubclassNo(String subclassNo) {
		this.subclassNo = subclassNo;
	}

	public String getSubclassName() {
		return subclassName;
	}

	public void setSubclassName(String subclassName) {
		this.subclassName = subclassName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}