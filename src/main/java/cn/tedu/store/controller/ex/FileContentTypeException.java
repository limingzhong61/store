package cn.tedu.store.controller.ex;

/**
 * 文件类型异常
 */
public class FileContentTypeException extends FileUploadException {

	private static final long serialVersionUID = -911131378972632004L;

	public FileContentTypeException() {
		super();
	}

	public FileContentTypeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FileContentTypeException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileContentTypeException(String message) {
		super(message);
	}

	public FileContentTypeException(Throwable cause) {
		super(cause);
	}

}
