package chapter17.streams.demo.filter;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class UpperCaseWriter extends FilterWriter {

	protected UpperCaseWriter(Writer writer) {
		super(writer);
	}

	@Override
	public void write(int c) throws IOException {
		char ch = Character.toUpperCase((char) c);
		super.write((int) ch);
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		for (int i = 0; i < len; i++) {
			this.write(cbuf[i + off]);
		}
	}

	@Override
	public void write(String str, int off, int len) throws IOException {
		this.write(str.toCharArray(), off, len);
	}
}
