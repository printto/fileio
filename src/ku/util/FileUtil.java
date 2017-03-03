package ku.util;

import java.io.*;

public class FileUtil {

	static void copy(InputStream in, OutputStream out) {
		try {
			int buffer;
			while((buffer = in.read()) >= 0) out.write(buffer);
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	static void copy(InputStream in, OutputStream out, int blocksize) {
		byte[] buffer = new byte[blocksize];
		int length;
		try {
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	static void bcopy(InputStream in, OutputStream out) {
		Reader reader = new InputStreamReader( in );
		BufferedReader br = new BufferedReader( reader );
		String line = null;
		PrintWriter printer = new PrintWriter(out);
		// readLine() is null when end of input is reached
		try {
			while( (line = br.readLine()) != null ) {
				printer.println( line );
			}
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

}
