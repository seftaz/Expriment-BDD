# آزمایش BDD

## مسئله اول

![Screenshot (183)](https://github.com/seftaz/Expriment-BDD/assets/79263953/7d23b846-fccb-4b55-9766-2a16a26eb49d)# Expriment-BDD

در ابتدا یک پروژه جدید Maven در اینتلیجی میسازیم و دیپیندنسی های میون گفته شده را به آن اضافه میکنیم. با اجرای maven->test میبینیم که پیغام BUILD SUCCESS نمایان میشود.

![photo_2024-04-26_23-14-50](https://github.com/seftaz/Expriment-BDD/assets/79263953/cff1f133-ed19-42c5-b764-77a01629608d)

حال میبینیم که لایبرری های مورد نیاز به پروژه اضافه شدند.

![photo_2024-04-26_23-14-59](https://github.com/seftaz/Expriment-BDD/assets/79263953/26b567b7-241b-4c6f-b244-55fbbb5557ba)

حال فولدر resources را ساخته و به عنوان Test Resource Root انتخاب میکنیم

![photo_2024-04-26_23-15-02](https://github.com/seftaz/Expriment-BDD/assets/79263953/92b9ec51-96a7-41aa-a7d3-e95a00c4a58b)

حال در فایل calculator.featue که طبق دستور کار ساختیم این سناریو را قرار میدهیم

![image](https://github.com/seftaz/Expriment-BDD/assets/79263953/afe70f01-fc07-42c8-a252-d0378a70ee02)

و سپس در فایل MyStepdefs.java توابعی که توسط خود اینتلیجی جنریت شدند را پر میکنیم

![image](https://github.com/seftaz/Expriment-BDD/assets/79263953/2630c2b3-4a48-4c92-87af-4833508c7ebb)

پس از تعریف کلاس calculator و پر کردن متود add، تست ها را ران میکنیم که موفقیت آمیز است:

![Screenshot (180)](https://github.com/seftaz/Expriment-BDD/assets/79263953/bf2abd7b-c677-488c-b20e-c22ff326456d)

طبق دستور کار فایل RunnerTest.java را میسازیم تا از جزئیات اجزای تست ها با خبر شویم.

![Screenshot (181)](https://github.com/seftaz/Expriment-BDD/assets/79263953/c1e22a02-7b31-4529-9e8d-029979242e2f)

با تغییر مقدار Expected به 30000 میبینیم که تست fail میشود

![Screenshot (182)](https://github.com/seftaz/Expriment-BDD/assets/79263953/96e1e222-cae5-45d9-94c3-a882c7234ff2)

حال به فایل سناریوها، outline گفته شده را اضافه میکنیم

![image](https://github.com/seftaz/Expriment-BDD/assets/79263953/570cec53-dac8-4226-85b4-ec94189b3d96)

با اجرای این تست به ارور missing value برای برخی تست ها میخوریم

![Screenshot (183)](https://github.com/seftaz/Expriment-BDD/assets/79263953/5131130a-ae3d-48ef-ae57-fcc033c8cc77)

این به این دلیل است که یکی از سناریوها عدد 1- را ورودی میدهد که توسط رجکس (+d\\) قابل شناسایی نیست. برای رفع این مشکل از رجکس "^Two input values, (\\d+) and (\\d+)$" استفاده میکنیم.


![Screenshot (184)](https://github.com/seftaz/Expriment-BDD/assets/79263953/31357d0d-f2d9-4532-8b5a-2509ac93d313)

میبینیم که تست ها پاس میشوند.

## مسئله دوم

در این قسمت میخواهیم یه ماشین حسابمان یک فیچر اضافه کنیم که عملیات‌های ضرب و تقسیم و توان را هم انجام دهد. به این منظور، برنچ feat/pro-calculator را از روی برنچ main میسازیم.

حال یک فایل برای سناریوهای جدید به نام pro-calculator.feature میسازیم (در همان مسیر قبلی) و سناریوهای جدید به همراه outline را به آن اضافه میکنیم.

![Screenshot (186)](https://github.com/seftaz/Expriment-BDD/assets/79263953/56faedef-2aac-42c8-9281-b45aada02f5e)

حال در فایل Stepdefs باید توابع مخصوص هر یک را اضافه کنیم. توجه کنید مرحله Then I expect the result با قبلی یکسان است و از همان توابع قبلی استفاده میکنیم.

![Screenshot (187)](https://github.com/seftaz/Expriment-BDD/assets/79263953/7531f552-5699-473e-9b7b-a1dae8408354)

حال تست ها fail میشوند چون باید تابع calculate را در ماشین حسابمان اضافه کنیم.

![Screenshot (188)](https://github.com/seftaz/Expriment-BDD/assets/79263953/c6a37c2c-717d-4200-8f5a-9c649bb7288a)

توجه کنید خروجی این تابع int است و موارد اعشاری پیاده سازی نشده اند چون در قسمت قبل هم پیاده سازی نشده بودند و جزو اهداف آزمایش نیستند. وگرنه مشخص است باید انها را هم در نظر گرفت و رجکس را هم باید تغییر داد (یک عدد با یک نقطه و یک عدد اختیاری بعد آن).

حال تست ها را ران میکنیم و میبینیم این سناریو هم پاس میشود.

![Screenshot (189)](https://github.com/seftaz/Expriment-BDD/assets/79263953/b76c2888-24e9-4136-88f7-95c1c4424db0)

در نهایت این فیچر را هم پوش میکنیم و با برنچ main مرج میکنیم.

![Screenshot (190)](https://github.com/seftaz/Expriment-BDD/assets/79263953/61988669-4dbb-4717-ba56-407efeab83b8)

با تشکر از توجه شما.
