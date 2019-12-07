package com.hfad.tanktests.Model;


        // класс для фонового потока заполнения таблицы с вопросами

import android.util.Log;

import com.hfad.tanktests.R;
import com.hfad.tanktests.utils.ContextApp;

public class FillDB implements Runnable{

    // сохранение

    @Override
    public void run() {

        //__________________________________________________________________________________________
        //заполнение таблицы Question
        //__________________________________________________________________________________________

        Question question1 = new Question();
        question1.id = 0;
        question1.id_Test = 0;
        question1.text = "Этот 14-тонный танк, вооружённый 75-мм орудием и двумя 8-мм пулемётами";
        question1.picture = R.drawable.picture1_1;
        question1.answer1 = "Германский A7V";
        question1.answer2 = "Французский Schneider CA1";
        question1.answer3 = "Итальянский Fiat 2000";
        question1.true_answer = question1.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question1);


        Question question2 = new Question();
        question2.id = 1;
        question2.id_Test = 0;
        question2.text = "Ещё один 14-тонный танк с четырьмя 7,7-мм пулемётами. Это";
        question2.picture = R.drawable.picture1_2;
        question2.answer1 = "Британский Medium Mark A Whippet";
        question2.answer2 = "Германский Leichter Kampfwagen I";
        question2.answer3 = "Французский Renault FT";
        question2.true_answer = question2.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question2);


        Question question3 = new Question();
        question3.id = 2;
        question3.id_Test = 0;
        question3.text = "Этот созданный как дешёвая альтернатива для Renault FT с широким применением автомобильных агрегатов лёгкий танк";
        question3.picture = R.drawable.picture1_3;
        question3.answer1 = "Германский K-Wagen";
        question3.answer2 = "Французский Char Frot-Turmel-Laffly";
        question3.answer3 = "Американский Ford 3-Ton M1918";
        question3.true_answer = question3.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question3);


        Question question4 = new Question();
        question4.id = 3;
        question4.id_Test = 0;
        question4.text = "22-тонный танк, вооружённый 75-мм орудием и четырьмя 8-мм пулемётами";
        question4.picture = R.drawable.picture1_4;
        question4.answer1 = "Французский Saint-Chamond";
        question4.answer2 = "Британский Mark IV tank";
        question4.answer3 = "Российский Царь-танк";
        question4.true_answer = question4.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question4);


        Question question5 = new Question();
        question5.id = 4;
        question5.id_Test = 0;
        question5.text = "Этот 40-тонный танк, вооружённый 65-мм орудием и шестью 6,5-мм пулемётами";
        question5.picture = R.drawable.picture1_5;
        question5.answer1 = "Американский Steam Wheel Tank";
        question5.answer2 = "Французский Schneider CA1";
        question5.answer3 = "Итальянский Fiat 2000";
        question5.true_answer = question5.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question5);


        Question question6 = new Question();
        question6.id = 5;
        question6.id_Test = 0;
        question6.text = "38-тонный танк с экипажем из 10–12 человек, вооружённый двумя 57-мм пушками и пятью (в другой версии – семью) пулемётами";
        question6.picture = R.drawable.picture1_6;
        question6.answer1 = "Британский Mark V tank";
        question6.answer2 = "Англо-американский Mark VIII Liberty";
        question6.answer3 = "Итальянский Fiat 3000";
        question6.true_answer = question6.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question6);


        Question question7 = new Question();
        question7.id = 6;
        question7.id_Test = 0;
        question7.text = "30-тонный танк с экипажем из 18 человек, вооружённый 57-мм пушкой и шестью 7,92-мм пулемётами";
        question7.picture = R.drawable.picture1_7;
        question7.answer1 = "Британский Medium Mark C";
        question7.answer2 = "Французский FCM 2C";
        question7.answer3 = "Германский A7V";
        question7.true_answer = question7.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question7);


        Question question8 = new Question();
        question8.id = 7;
        question8.id_Test = 0;
        question8.text = "Этот 9-тонный танк с экипажем из трех человек";
        question8.picture = R.drawable.picture1_8;
        question8.answer1 = "Германский Leichter Kampfwagen II";
        question8.answer2 = "Британский Medium Mark A Whippet";
        question8.answer3 = "Французский Renault FT";
        question8.true_answer = question8.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question8);


        Question question9 = new Question();
        question9.id = 8;
        question9.id_Test = 0;
        question9.text = "Этот 20-тонный танк с экипажем из 4 человек, вооружённый пятью 7,7-мм пулемётами";
        question9.picture = R.drawable.picture1_9;
        question9.answer1 = "Британский Medium Mark C";
        question9.answer2 = "Немецкий Sturmpanzerwagen Oberschlesien";
        question9.answer3 = "Французский Saint-Chamond";
        question9.true_answer = question9.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question9);


        Question question10 = new Question();
        question10.id = 9;
        question10.id_Test = 0;
        question10.text = "Эта лицензионная версия самого удачного танка Первой мировой войны французского Renault FT";
        question10.picture = R.drawable.picture1_10;
        question10.answer1 = "Советский/русский «Рено»";
        question10.answer2 = "Итальянский Fiat 3000";
        question10.answer3 = "Американский M1917 light tank";
        question10.true_answer = question10.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question10);


        Question question11 = new Question();
        question11.id = 10;
        question11.id_Test = 1;
        question11.text = "Израильский тяжёлый БТР Nagmachon создан на базе танка";
        question11.picture = R.drawable.picture2_1;
        question11.answer1 = "Советского Т-55";
        question11.answer2 = "Американского M60";
        question11.answer3 = "Британского Centurion";
        question11.true_answer = question11.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question11);


        Question question12 = new Question();
        question12.id = 11;
        question12.id_Test = 1;
        question12.text = "Тайваньский лёгкий танк Type 64 «собран» из";
        question12.picture = R.drawable.picture2_2;
        question12.answer1 = "Шасси китайского лёгкого танка Тип 62 и башни японского среднего танка Тип 61";
        question12.answer2 = "Шасси французского лёгкого танка AMX-13 и башни советского плавающего танка ПТ-76";
        question12.answer3 = "Шасси американской ЗСУ M42 Duster и башни американского истребителя танков M18 Hellcat";
        question12.true_answer = question12.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question12);


        Question question13 = new Question();
        question13.id = 12;
        question13.id_Test = 1;
        question13.text = "Египетская противотанковая САУ Т-100 построена на базе";
        question13.picture = R.drawable.picture2_3;
        question13.answer1 = "Американского бронетранспортёра М-113";
        question13.answer2 = "Советского среднего танка Т-34-85";
        question13.answer3 = "Немецкого среднего танка Panzerkampfwagen V Panther";
        question13.true_answer = question13.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question13);


        Question question14 = new Question();
        question14.id = 13;
        question14.id_Test = 1;
        question14.text = "Эта кубинская противотанковая самоходная артиллерийская установка построена на шасси";
        question14.picture = R.drawable.picture2_4;
        question14.answer1 = "Советской боевой машины пехоты БМП-1";
        question14.answer2 = "Испанской боевой машины пехоты Pizarro";
        question14.answer3 = "Советского бронетранспортёра МТ-ЛБ";
        question14.true_answer = question14.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question14);


        Question question15 = new Question();
        question15.id = 14;
        question15.id_Test = 1;
        question15.text = "Египетский средний танк M4A4 состоит из";
        question15.picture = R.drawable.picture2_5;
        question15.answer1 = "Башни французского разведывательного бронеавтомобиля Panhard EBR и шасси американского БТР M113";
        question15.answer2 = "Башни немецкого среднего танка PzKpfw III на шасси итальянского среднего танка M15/42";
        question15.answer3 = "Башни французского лёгкого танка АМХ-13 на шасси американского танка M4 Sherman";
        question15.true_answer = question15.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question15);


        Question question16 = new Question();
        question16.id = 15;
        question16.id_Test = 1;
        question16.text = "Израильские тяжёлые бронетранспортёры Achzarit создавались на базе";
        question16.picture = R.drawable.picture2_6;
        question16.answer1 = "Американских средних танков M47 и M48 Patton";
        question16.answer2 = "Советских средних танков Т-54 и Т-55";
        question16.answer3 = "Британских средних танков Centurion";
        question16.true_answer = question16.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question16);


        Question question17 = new Question();
        question17.id = 16;
        question17.id_Test = 1;
        question17.text = "Этот вариант немецкой противотанковой САУ Marder I построен на базе";
        question17.picture = R.drawable.picture2_7;
        question17.answer1 = "Трофейной польской танкетки TKS";
        question17.answer2 = "Трофейного советского лёгкого танка Т-70";
        question17.answer3 = "Трофейного французского лёгкого танка FCM 36";
        question17.true_answer = question17.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question17);


        Question question18 = new Question();
        question18.id = 17;
        question18.id_Test = 1;
        question18.text = "Финское 114-мм штурмовое орудие BT-42 создано на базе";
        question18.picture = R.drawable.picture2_8;
        question18.answer1 = "Советского лёгкого танка БТ-7";
        question18.answer2 = "Советского лёгкого танка БТ-5";
        question18.answer3 = "Советского лёгкого танка Т-80";
        question18.true_answer = question18.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question18);


        Question question19 = new Question();
        question19.id = 18;
        question19.id_Test = 1;
        question19.text = "Немецкая противотанковая САУ 4.7 cm Pak (t) (Sfl.) auf Fgst.Pz.Kpfw.35 R 731 (f) с чехословацкой пушкой P.U.V.vz.36 строилась на базе трофейного";
        question19.picture = R.drawable.picture2_9;
        question19.answer1 = "Французского лёгкого танка R-35";
        question19.answer2 = "Чехословацкого лёгкого танка LT vz.38";
        question19.answer3 = "Советского лёгкого танка Т-26";
        question19.true_answer = question19.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question19);


        Question question20 = new Question();
        question20.id = 19;
        question20.id_Test = 1;
        question20.text = "Советская самоходная артиллерийская установка СУ-76и, создавалась на базе";
        question20.picture = R.drawable.picture2_10;
        question20.answer1 = "Прошедших модернизацию и ремонт советских лёгких танков Т-60";
        question20.answer2 = "Поставлявшегося по ленд-лизу американского среднего танка M3 Lee";
        question20.answer3 = "Трофейных немецких среднего танка Pz Kpfw III и штурмового орудия StuG III";
        question20.true_answer = question20.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question20);


        Question question21 = new Question();
        question21.id = 20;
        question21.id_Test = 2;
        question21.text = "Самую большую массу из перечисленных ниже тяжёлых танков имел";
        question21.picture = R.drawable.picture3_1;
        question21.answer1 = "Mk IV Churchill";
        question21.answer2 = "ИС-2";
        question21.answer3 = "Panzerkampfwagen Tiger Ausf. E (Tiger I)";
        question21.true_answer = question21.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question21);



        Question question22 = new Question();
        question22.id = 21;
        question22.id_Test = 2;
        question22.text = "На каком из перечисленных танков главным вооружением являлось орудие с самым большим калибром?";
        question22.picture = R.drawable.picture3_2;
        question22.answer1 = "Panzerkampfwagen VI Ausf. B (Tiger II)";
        question22.answer2 = "КВ-2";
        question22.answer3 = "M26 Pershing";
        question22.true_answer = question22.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question22);



        Question question23 = new Question();
        question23.id = 22;
        question23.id_Test = 2;
        question23.text = "Самый мощный двигатель из трёх перечисленных танков имел";
        question23.picture = R.drawable.picture3_3;
        question23.answer1 = "Советский Т-34";
        question23.answer2 = "Немецкий Panzerkampfwagen IV";
        question23.answer3 = "Американский M4 Sherman";
        question23.true_answer = question23.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question23);




        Question question24 = new Question();
        question24.id = 23;
        question24.id_Test = 2;
        question24.text = "Какой из ниже перечисленных танков развивал наибольшую максимальную скорость?";
        question24.picture = R.drawable.picture3_4;
        question24.answer1 = "БТ-7";
        question24.answer2 = "Panzerkampfwagen II";
        question24.answer3 = "Cruiser Mk VIII Cromwell";
        question24.true_answer = question24.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question24);




        Question question25 = new Question();
        question25.id = 24;
        question25.id_Test = 2;
        question25.text = "Самой толстой лобовой бронёй корпуса из перечисленных танков обладал";
        question25.picture = R.drawable.picture3_5;
        question25.answer1 = "ИС-2";
        question25.answer2 = "Panzerkampfwagen VI Ausf. B (Tiger II)";
        question25.answer3 = "M26 Pershing";
        question25.true_answer = question25.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question25);



        Question question26 = new Question();
        question26.id = 25;
        question26.id_Test = 2;
        question26.text = "Самое большое количество снарядов в возимом боекомплекте среди перечисленных танков имел";
        question26.picture = R.drawable.picture3_6;
        question26.answer1 = "Panzerkampfwagen V Panther";
        question26.answer2 = "Cruiser Comet I";
        question26.answer3 = "Т-34-85";
        question26.true_answer = question26.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question26);



        Question question27 = new Question();
        question27.id = 26;
        question27.id_Test = 2;
        question27.text = "Самым большим запасом хода из перечисленных ниже танков мог похвастаться";
        question27.picture = R.drawable.picture3_7;
        question27.answer1 = "Medium Tank M3 (Lee)";
        question27.answer2 = "Panzerkampfwagen III";
        question27.answer3 = "Т-34";
        question27.true_answer = question27.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question27);



        Question question28 = new Question();
        question28.id = 27;
        question28.id_Test = 2;
        question28.text = "Самую высокую удельную мощность из перечисленных ниже лёгких танков имел";
        question28.picture = R.drawable.picture3_8;
        question28.answer1 = "Т-70";
        question28.answer2 = "Light Tank M3 (Stuart)";
        question28.answer3 = "PzKpfw I";
        question28.true_answer = question28.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question28);



        Question question29 = new Question();
        question29.id = 28;
        question29.id_Test = 2;
        question29.text = "Какой из перечисленных ниже танков имел самый большой по численности экипаж?";
        question29.picture = R.drawable.picture3_9;
        question29.answer1 = "Panzerkampfwagen VIII Maus";
        question29.answer2 = "Char 2C";
        question29.answer3 = "Т-35";
        question29.true_answer = question29.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question29);



        Question question30 = new Question();
        question30.id = 29;
        question30.id_Test = 2;
        question30.text = "Орудие какого танка из перечисленных имело самый длинный ствол (в метрах)?";
        question30.picture = R.drawable.picture3_10;
        question30.answer1 = "90 mm Gun M3 американского танка M26 Pershing";
        question30.answer2 = "122-мм Д-25Т советского танка ИС-2";
        question30.answer3 = "88-мм KwK 43 L/71 немецкого танка Panzerkampfwagen VI Tiger II";
        question30.true_answer = question30.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question30);



        Question question31 = new Question();
        question31.id = 30;
        question31.id_Test = 3;
        question31.text = "Какому образцу бронетехники соответствует данный силуэт?";
        question31.picture = R.drawable.picture4_1;
        question31.answer1 = "Т-90С Bhishma (Индия)";
        question31.answer2 = "Тype 97 Chi-Ha (Япония)";
        question31.answer3 = "Strv 103 (Швеция)";
        question31.true_answer = question31.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question31);




        Question question32 = new Question();
        question32.id = 31;
        question32.id_Test = 3;
        question32.text = "Какому образцу бронетехники соответствует данный силуэт?";
        question32.picture = R.drawable.picture4_2;
        question32.answer1 = "ИС-3 (СССР)";
        question32.answer2 = "Т-44 (СССР)";
        question32.answer3 = "КВ-85 (СССР)";
        question32.true_answer = question32.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question32);


        Question question33 = new Question();
        question33.id = 32;
        question33.id_Test = 3;
        question33.text = "Какому образцу бронетехники соответствует данный силуэт?";
        question33.picture = R.drawable.picture4_3;
        question33.answer1 = "М60А2 (США)";
        question33.answer2 = "CV-33 (Италия)";
        question33.answer3 = "FV 4030 Challenger (Великобритания)";
        question33.true_answer = question33.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question33);




        Question question34 = new Question();
        question34.id = 33;
        question34.id_Test = 3;
        question34.text = "Какому образцу бронетехники соответствует данный силуэт?";
        question34.picture = R.drawable.picture4_4;
        question34.answer1 = "Тype 90 (Япония)";
        question34.answer2 = "ZTZ-99 (Китай)";
        question34.answer3 = "PT-85 (Северная Корея)";
        question34.true_answer = question34.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question34);



        Question question35 = new Question();
        question35.id = 34;
        question35.id_Test = 3;
        question35.text = "Какому образцу бронетехники соответствует данный силуэт?";
        question35.picture = R.drawable.picture4_5;
        question35.answer1 = "Vickers Mk E (Великобритания)";
        question35.answer2 = "М14/41 (Италия)";
        question35.answer3 = "Т32 (США)";
        question35.true_answer = question35.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question35);



        Question question36 = new Question();
        question36.id = 35;
        question36.id_Test = 3;
        question36.text = "Какому образцу бронетехники соответствует данный силуэт?";
        question36.picture = R.drawable.picture4_6;
        question36.answer1 = "Altay MBT (Турция)";
        question36.answer2 = "Bernardini-X1A2 (Бразилия)";
        question36.answer3 = "Olifant Mk. 1A (ЮАР)";
        question36.true_answer = question36.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question36);



        Question question37 = new Question();
        question37.id = 36;
        question37.id_Test = 3;
        question37.text = "Какому образцу бронетехники соответствует данный силуэт?";
        question37.picture = R.drawable.picture4_7;
        question37.answer1 = "Pz.Kpfw.IV (Германия)";
        question37.answer2 = "Marmon-Herrington MTLS-1GI4 (США)";
        question37.answer3 = "CV-35 (Италия)";
        question37.true_answer = question37.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question37);



        Question question38 = new Question();
        question38.id = 37;
        question38.id_Test = 3;
        question38.text = "Какому образцу бронетехники соответствует данный силуэт?";
        question38.picture = R.drawable.picture4_8;
        question38.answer1 = "Leopard 2А3 (ФРГ)";
        question38.answer2 = "Vijayanta Mark 1 (Индия)";
        question38.answer3 = "Тype 89 (Япония)";
        question38.true_answer = question38.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question38);



        Question question39 = new Question();
        question39.id = 38;
        question39.id_Test = 3;
        question39.text = "Какому образцу бронетехники соответствует данный силуэт?";
        question39.picture = R.drawable.picture4_9;
        question39.answer1 = "Leclerc АМХ-56 (Франция)";
        question39.answer2 = "PT-91 Twardy (Польша)";
        question39.answer3 = "Т-90 (Россия)";
        question39.true_answer = question39.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question39);




        Question question40 = new Question();
        question40.id = 39;
        question40.id_Test = 3;
        question40.text = "Какому образцу бронетехники соответствует данный силуэт?";
        question40.picture = R.drawable.picture4_10;
        question40.answer1 = "Ramses II (Египет)";
        question40.answer2 = "Al Khalid (Пакистан)";
        question40.answer3 = "Magach-7А (Израиль)";
        question40.true_answer = question40.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question40);



        Question question41 = new Question();
        question41.id = 40;
        question41.id_Test = 4;
        question41.text = "У какого из этих западных основных боевых танков есть автомат заряжания?";
        question41.picture = R.drawable.picture5_1;
        question41.answer1 = "Американский M1A2 Abrams";
        question41.answer2 = "Французский Leclerc";
        question41.answer3 = "Немецкий Leopard 2A5";
        question41.true_answer = question41.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question41);



        Question question42 = new Question();
        question42.id = 41;
        question42.id_Test = 4;
        question42.text = "Боекомплект орудия какого из этих танков самый большой?";
        question42.picture = R.drawable.picture5_2;
        question42.answer1 = "Советский Т-72";
        question42.answer2 = "Украинский БМ «Оплот»";
        question42.answer3 = "Британский Challenger 2";
        question42.true_answer = question42.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question42);



        Question question43 = new Question();
        question43.id = 42;
        question43.id_Test = 4;
        question43.text = "Какой из этих основных боевых танков 60-х годов имеет наибольший вес?";
        question43.picture = R.drawable.picture5_3;
        question43.answer1 = "Британский Chieftain";
        question43.answer2 = "Французский AMX-30";
        question43.answer3 = "Западногерманский Leopard 1";
        question43.true_answer = question43.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question43);



        Question question44 = new Question();
        question44.id = 43;
        question44.id_Test = 4;
        question44.text = "Самый мощный двигатель из этих трёх азиатских машин у";
        question44.picture = R.drawable.picture5_4;
        question44.answer1 = "Иранского танка Зульфикар 3";
        question44.answer2 = "Израильского танка Меркава IV";
        question44.answer3 = "Индийского танка Арджун";
        question44.true_answer = question44.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question44);



        Question question45 = new Question();
        question45.id = 44;
        question45.id_Test = 4;
        question45.text = "У какого из этих танков самая высокая удельная мощность?";
        question45.picture = R.drawable.picture5_5;
        question45.answer1 = "Немецкий Leopard 2A6";
        question45.answer2 = "Американский M1A2 Abrams";
        question45.answer3 = "Российский Т-14 «Армата»";
        question45.true_answer = question45.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question45);



        Question question46 = new Question();
        question46.id = 45;
        question46.id_Test = 4;
        question46.text = "Какой из этих послевоенных лёгких танков НЕ умеет плавать?";
        question46.picture = R.drawable.picture5_6;
        question46.answer1 = "Австрийский SK105 Kürassier";
        question46.answer2 = "Советский ПТ-76";
        question46.answer3 = "Американский M551 Sheridan";
        question46.true_answer = question46.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question46);



        Question question47 = new Question();
        question47.id = 46;
        question47.id_Test = 4;
        question47.text = "На какой из этих танков в качестве основного вооружения устанавливалась 152-мм пушка - пусковая установка ПТУР?";
        question47.picture = R.drawable.picture5_7;
        question47.answer1 = "На югославский М-84";
        question47.answer2 = "На советский Т-64Б";
        question47.answer3 = "На американский М60А2";
        question47.true_answer = question47.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question47);




        Question question48 = new Question();
        question48.id = 47;
        question48.id_Test = 4;
        question48.text = "Внутри какого из этих основных боевых танков имеется отсек, который можно использовать для перевозки десанта?";
        question48.picture = R.drawable.picture5_8;
        question48.answer1 = "Итальянский Ariete";
        question48.answer2 = "Румынский TR-85";
        question48.answer3 = "Израильский Меркава IV";
        question48.true_answer = question48.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question48);



        Question question49 = new Question();
        question49.id = 48;
        question49.id_Test = 4;
        question49.text = "Самый тяжёлый (по массе) из этих трёх серийных тяжёлых танков периода Холодной войны";
        question49.picture = R.drawable.picture5_9;
        question49.answer1 = "Советский Т-10М";
        question49.answer2 = "Британский Conqueror";
        question49.answer3 = "Американский M103";
        question49.true_answer = question49.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question49);



        Question question50 = new Question();
        question50.id = 49;
        question50.id_Test = 4;
        question50.text = "Какой из этих танков создан на базе западногерманской БМП Marder?";
        question50.picture = R.drawable.picture5_10;
        question50.answer1 = "Аргентинский TAM";
        question50.answer2 = "Швейцарский Panzer 68";
        question50.answer3 = "Бразильский EE-T1 Osório";
        question50.true_answer = question50.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question50);







        //__________________________________________________________________________________________
        //заполнение таблицы Test
        //__________________________________________________________________________________________

        Test test1 = new Test();
        test1.id = 0;
        test1.name = "На заре танковой эры";
        test1.picture = R.drawable.test1_cover;
        test1.description = "Попробуйте по фотографиям идентифицировать 10 гусеничных боевых машин, созданных в годы Первой мировой войны, когда многие из них ещё здорово отличались от привычных нам танков";
        test1.status = 0;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertTest(test1);


        Test test2 = new Test();
        test2.id = 1;
        test2.name = "Бронеапгрейд";
        test2.picture = R.drawable.test2_cover;
        test2.description = "Попробуйте определить, какие серийные машины стали основой для десяти модернизированных образцов бронетехники разных государств";
        test2.status = 0;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertTest(test2);


        Test test3 = new Test();
        test3.id = 2;
        test3.name = "Сравнительное танковедение";
        test3.picture = R.drawable.test3_cover;
        test3.description = "Насколько хорошо вы представляете, как соотносятся между собой по своим тактико-техническим характеристикам танки Второй мировой войны?";
        test3.status = 0;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertTest(test3);


        Test test4 = new Test();
        test4.id = 3;
        test4.name = "Знакомый силуэт";
        test4.picture = R.drawable.test4_cover;
        test4.description = "Сможете ли вы распознать десять танков только по их контурам?";
        test4.status = 0;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertTest(test4);


        Test test5 = new Test();
        test5.id = 4;
        test5.name = "Послевоенное сравнительное танковедение";
        test5.picture = R.drawable.test5_cover;
        test5.description = "Десять вопросов о танках разных стран послевоенного периода";
        test5.status = 0;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertTest(test5);






        Log.i("my_teg", "(FillDB) БД заполнена!");








    }

}
