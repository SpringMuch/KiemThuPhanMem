# BÀI TẬP KIỂM THỬ PHẦN MỀM

## 1. Hoàn thiện và nộp ảnh *Can't Unsee*

* Sinh viên hoàn thiện bài tập *Can't Unsee* theo yêu cầu của giảng viên.
* Ảnh kết quả được nộp đúng định dạng và đúng hạn theo quy định.

---

## 2. Viết Test Case – Dự án Phân tích dữ liệu điểm số học sinh

### 2.1. Mô tả bài toán

Chương trình hỗ trợ giáo viên phân tích danh sách điểm số của học sinh, bao gồm các chức năng chính:

* Đếm số học sinh giỏi (điểm (\ge 8.0)).
* Tính điểm trung bình của các học sinh có điểm hợp lệ (từ 0.0 đến 10.0).

Các điểm không hợp lệ (nhỏ hơn 0.0 hoặc lớn hơn 10.0) sẽ bị bỏ qua trong quá trình xử lý.

### 2.2. Các trường hợp kiểm thử (Test Cases)

Hệ thống được kiểm thử với các nhóm dữ liệu sau:

* **Dữ liệu chuẩn**: Danh sách điểm bao gồm cả điểm hợp lệ và không hợp lệ.
* **Giá trị biên**: Điểm đúng bằng 0.0 và 10.0.
* **Dữ liệu lỗi**: Điểm âm hoặc điểm lớn hơn 10.0 (phải bị loại bỏ).
* **Danh sách rỗng**: Chương trình trả về kết quả mặc định là 0.

### 2.3. Hướng dẫn chạy kiểm thử

1. Mở dự án trong môi trường hỗ trợ Java (VS Code, IntelliJ IDEA hoặc Eclipse).
2. Đảm bảo thư viện **JUnit 5** đã được thêm vào *classpath* của dự án.
3. Chuột phải vào file `StudentAnalyzerTest.java` và chọn **Run Test** để thực thi các ca kiểm thử.

---

## 3. Hoàn thiện bài tập Cypress

* Xây dựng và chạy các kịch bản kiểm thử tự động bằng Cypress.
* Đảm bảo các test case chạy thành công và phản ánh đúng hành vi của hệ thống.
* Lưu kết quả kiểm thử theo yêu cầu bài tập.

---

## 4. Hoàn thiện bài tập Kiểm thử hiệu năng với JMeter

* Thiết kế các kịch bản kiểm thử hiệu năng bằng Apache JMeter.
* Cấu hình các tham số như số lượng người dùng, thời gian chạy và hành vi truy cập.
* Phân tích kết quả kiểm thử và tổng hợp báo cáo đánh giá hiệu năng hệ thống.

---

