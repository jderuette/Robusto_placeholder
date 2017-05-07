/**
MIT License

Copyright (c) 2017 Djer13

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
**/
package org.djer.robusto.placeholder.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Placeholder {

	private Integer userId;
	@SuppressWarnings("PMD.ShortVariable")
	private Integer id;
	private String title;
	private String body;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final String startClass = "[";
		final String endCLass = "]";
		final StringBuilder builder = new StringBuilder(50);

		builder.append("PlaceholderDTO ").append(startClass);
		if (this.userId != null) {
			builder.append("userId=").append(this.userId).append(", ");
		}
		if (this.id != null) {
			builder.append("id=").append(this.id).append(", ");
		}
		if (this.title != null) {
			builder.append("title=").append(this.title).append(", ");
		}
		if (this.body != null) {
			builder.append("body=").append(this.body);
		}
		builder.append(endCLass);
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	@SuppressWarnings("PMD.NPathComplexity")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.body == null ? 0 : this.body.hashCode());
		result = prime * result + (this.id == null ? 0 : this.id.hashCode());
		result = prime * result + (this.title == null ? 0 : this.title.hashCode());
		result = prime * result + (this.userId == null ? 0 : this.userId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	@SuppressWarnings({ "PMD.NPathComplexity", "PMD.CyclomaticComplexity", "PMD.ModifiedCyclomaticComplexity",
			"PMD.StdCyclomaticComplexity" })
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final Placeholder other = (Placeholder) obj;
		if (this.body == null) {
			if (other.body != null) {
				return false;
			}
		} else if (!this.body.equals(other.body)) {
			return false;
		}
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		if (this.title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!this.title.equals(other.title)) {
			return false;
		}
		if (this.userId == null) {
			if (other.userId != null) {
				return false;
			}
		} else if (!this.userId.equals(other.userId)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return this.userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(final Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	@SuppressWarnings("PMD.ShortVariable")
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return this.body;
	}

	/**
	 * @param body
	 *            the body to set
	 */
	public void setBody(final String body) {
		this.body = body;
	}

}
