package cn.tedu.store.controller.ex;

/**
 * 文件为空的异常，当上传时没有提交文件数据，或选择的文件是0字节时出现该异常
 */
public class FileEmptyException extends FileUploadException {

	private static final long serialVersionUID = 5216328143694529891L;

	public FileEmptyException() {
		super();
	}

	public FileEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FileEmptyException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileEmptyException(String message) {
		super(message);
	}

	public FileEmptyException(Throwable cause) {
		super(cause);
	}
	
}