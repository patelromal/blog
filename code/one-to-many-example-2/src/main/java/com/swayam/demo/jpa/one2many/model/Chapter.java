package com.swayam.demo.jpa.one2many.model;

import java.io.Serializable;
import java.util.List;

public class Chapter implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String plotSummary;
	private Section contents;
	private List<Chapter> subChapters;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlotSummary() {
		return plotSummary;
	}

	public void setPlotSummary(String plotSummary) {
		this.plotSummary = plotSummary;
	}

	public Section getContents() {
		return contents;
	}

	public void setContents(Section contents) {
		this.contents = contents;
	}

	public List<Chapter> getSubChapters() {
		return subChapters;
	}

	public void setSubChapters(List<Chapter> subChapters) {
		this.subChapters = subChapters;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((plotSummary == null) ? 0 : plotSummary.hashCode());
		result = prime * result + ((subChapters == null) ? 0 : subChapters.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chapter other = (Chapter) obj;
		if (contents == null) {
			if (other.contents != null)
				return false;
		} else if (!contents.equals(other.contents))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (plotSummary == null) {
			if (other.plotSummary != null)
				return false;
		} else if (!plotSummary.equals(other.plotSummary))
			return false;
		if (subChapters == null) {
			if (other.subChapters != null)
				return false;
		} else if (!subChapters.equals(other.subChapters))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chapter [id=" + id + ", title=" + title + ", plotSummary=" + plotSummary + ", contents=" + contents
				+ ", subChapters=" + subChapters + "]";
	}

}
