package com.kaishengit.controller.result;

public class Result {

	 private String status;
	    private String message;
	    private Object obj;

	    public static Result success() {
	    	Result result = new Result();
	    	result.setStatus("success");
	        return result;
	    }

	    public static Result success(Object object) {
	    	Result result = new Result();
	    	result.setStatus("success");
	    	result.setObj(object);
	        return result;
	    }

	    public static Result error(String message) {
	    	Result result = new Result();
	    	result.setStatus("error");
	    	result.setMessage(message);
	        return result;
	    }

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Object getObj() {
			return obj;
		}

		public void setObj(Object obj) {
			this.obj = obj;
		}


}
