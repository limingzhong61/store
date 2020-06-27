package cn.tedu.store.controller.ex;

/**
 * 文件大小异常，当上传的文件的大小超出了限制时出现该异常
 */
public class FileSizeException extends FileUploadException {

	private static final long serialVersionUID = 3652563516851916279L;

	public FileSizeException() {
		super();
	}

	public FileSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FileSizeException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileSizeException(String message) {
		super(message);
	}

	public FileSizeException(Throwable cause) {
		super(cause);
	}

}
