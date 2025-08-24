package com.avva.four.profile;

import com.avva.four.profile.highschool.HighSchoolConfig;
import com.avva.four.profile.kindergarten.KindergartenConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnotherProfileDemo {
    private static Logger LOGGER = LoggerFactory.getLogger(AnotherProfileDemo.class);

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HighSchoolConfig.class, KindergartenConfig.class);

        var foodProviderService = context.getBean("foodProviderService", FoodProviderService.class);
        var lunchSet = foodProviderService.provideLunchSet();
        lunchSet.forEach(food -> LOGGER.info("Food: {}", food.getName()));
        context.close();
    }
}
