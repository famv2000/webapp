package fam.v.coursework.models;


/* Để giải quyết vấn đề chúng ta phải chuẩn hóa 1 đối tượng trả về, để khi trả về đúng hoặc sai thì dưới client
       đều trả về 1 kiểu nhất định.
    Vì sao phải tạo ra class này??
    Vì khi tìm 1 sản phầm có trong database thì phía client sẽ hiển thị ra info sản phẩm bình thường, NHƯNG
       khi tìm 1 sản phầm ko có trong database thì phía client sẽ hiển thị lỗi trong spring famework
    Vì vậy ta nên chuẩn hóa đối tượng trả về ngày cả khi không tìm thấy sản phẩm
 */


/*

 */
public class ResponseObject {

    private String status;
    private String message;
    private Object data;
    // Tại sao ta để kiểu Object? Vì trong này trường data của ta có rất nhiều loại (Product, user, ...)
    // Vì vậy nên để kiểu Object để có thểm tham chiếu đến nhiều kiểu data

    public ResponseObject(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
