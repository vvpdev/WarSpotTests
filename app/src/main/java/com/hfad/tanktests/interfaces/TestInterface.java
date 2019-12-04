package com.hfad.tanktests.interfaces;


import com.arellomobile.mvp.MvpView;
import com.hfad.tanktests.Model.Question;


public interface TestInterface extends MvpView {

        //передача презентеру принятого id выбранного теста
        void sendSelectedTestId();

        // загрузить данные на макет
        void onLoadDataToLayout(Question question);

        //переход на экран результата
        void onGoToResultScreen(int quantytiTrueAnswers);

        // цвет для ответов
        void onColorButtons(int idButton, Boolean check);

        //добавление прогресса
        void onChangedProgressBar(int progress);

        //максимальное значение прогресс бара = размер массива
        void initProgressBar(int max);

        // настройка кликабельности кнопок
        void settingButton(Boolean setting);

        // восстанавливаем дефолтный фон кнопок
        void onRestoreDefaultColor();

        // задать название теста заголовком
        void setTitleActivity(String name);


        // сообщение - клик по стрелке
        void showMessageAboutArrow();
}
