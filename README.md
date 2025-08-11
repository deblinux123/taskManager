

````markdown
# TaskManager

# 📝 مدیریت وظایف (Task Manager)

این پروژه یک برنامه ساده برای مدیریت وظایف (Tasks) است که با استفاده از Java، Spring Boot و Thymeleaf توسعه داده شده است. کاربران می‌توانند وظایف جدید ایجاد کنند، آن‌ها را ویرایش یا حذف کنند و لیست وظایف خود را مشاهده نمایند.

## 🚀 ویژگی‌ها
- افزودن وظیفه جدید با عنوان و توضیح
- ویرایش وظایف موجود
- حذف وظایف
- رابط کاربری ساده و زیبا با استفاده از Bootstrap
- احراز هویت و امکان خروج از حساب کاربری

## 🛠 تکنولوژی‌های استفاده‌شده
- Java 17+
- Spring Boot
- Thymeleaf
- Bootstrap 5
- HTML/CSS
- PostgreSQL
- Docker & Docker Compose

## 📦 نحوه اجرا

### اجرای محلی بدون داکر
1. ابتدا مخزن را کلون کنید:
   ```bash
   git clone https://github.com/deblinux123/taskManager.git
````

2. وارد پوشه پروژه شوید:

   ```bash
   cd taskManager
   ```
3. پروژه را اجرا کنید:

   ```bash
   ./mvnw spring-boot:run
   ```
4. سپس در مرورگر خود به آدرس زیر بروید:

   ```
   http://localhost:8080
   ```

---

### اجرای پروژه با Docker

1. مطمئن شوید Docker و Docker Compose روی سیستم شما نصب هستند.

2. فایل `docker-compose.yml` و `Dockerfile` را در ریشه پروژه قرار دهید.

3. برای ساخت و اجرای کانتینرها دستور زیر را اجرا کنید:

   ```bash
   docker-compose up --build
   ```

4. پس از بالا آمدن کانتینرها، برنامه روی آدرس زیر در دسترس است:

   ```
   http://localhost:8080
   ```

---

## 📁 ساختار پروژه

* `src/main/java`: کدهای بک‌اند
* `src/main/resources/templates`: صفحات HTML با Thymeleaf
* `src/main/resources/static`: فایل‌های CSS و JS

---

## 🙋‍♂️ مشارکت

اگر علاقه‌مند به توسعه این پروژه هستید، خوشحال می‌شویم که Pull Request ارسال کنید یا مشکلات (Issues) را گزارش دهید.

---

## 📄 مجوز

این پروژه تحت مجوز MIT منتشر شده است. برای اطلاعات بیشتر فایل LICENSE را بررسی کنید.

```

root
```
