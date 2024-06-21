package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n01.exceptions;

public class ErrorMessage {

        private int statusCode;
        private String message;
        private String description;

        public ErrorMessage(int statusCode, String message, String description) {
                this.statusCode = statusCode;
                this.message = message;
                this.description = description;
        }

        @Override
        public String toString() {
                return "ErrorMessage{" +
                        "statusCode=" + statusCode +
                        ", message='" + message + '\'' +
                        ", description='" + description + '\'' +
                        '}';
        }

        public int getStatusCode() {
                return statusCode;
        }

        public void setStatusCode(int statusCode) {
                this.statusCode = statusCode;
        }

        public String getMessage() {
                return message;
        }

        public void setMessage(String message) {
                this.message = message;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }
}
