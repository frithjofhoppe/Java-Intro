package com.herdt.java8.kap08;

class ObjectMethods {
	private int data = 0;

	int getData() {
		return data;
	}

	void setData(int data) {
		this.data = data;
	}

	protected Object clone() {
		ObjectMethods om = new ObjectMethods();
		om.setData(data);
		return om;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (this.getClass() != obj.getClass()))
			return false;
		return (data == (((ObjectMethods) obj).getData()));
	}
}
