package com.cc.controller;

import com.cc.pojo.StatisticsEntity;
import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SibyllaLee on 2017/3/21.
 */

@Controller
public class HistoryStatisticsController {
    private static String json;

    @RequestMapping(value = "/getStatisticByDay",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getStatisticByDay(){
        Gson gson = new Gson();
        StatisticsEntity entity = new StatisticsEntity(33, 645213, 3, "9.1%");
//        List<String> dayStatistics = new ArrayList<String>();
//        dayStatistics.add("33");
//        dayStatistics.add("645213");
//        dayStatistics.add("3");
//        dayStatistics.add("9.1%");
        List<StatisticsEntity> list = new ArrayList<StatisticsEntity>();
        list.add(entity);
        json = gson.toJson(list);
        return json;
    }

    @RequestMapping(value = "/getStatisticByWeek",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getStatisticByWeek(){
        Gson gson = new Gson();
        StatisticsEntity entity = new StatisticsEntity(213, 645213, 20, "9.4%");
//        List<String> weekStatistics = new ArrayList<String>();
//        weekStatistics.add("213");
//        weekStatistics.add("645213");
//        weekStatistics.add("20");
//        weekStatistics.add("9.4%");
        List<StatisticsEntity> list = new ArrayList<StatisticsEntity>();
        list.add(entity);
        json = gson.toJson(list);
        return json;
    }

    @RequestMapping(value = "/getStatisticByMonth",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getStatisticByMonth(){
        Gson gson = new Gson();
        StatisticsEntity entity = new StatisticsEntity(853, 645213, 82, "9.6%");
//        List<String> monthStatistics = new ArrayList<String>();
//        monthStatistics.add("853");
//        monthStatistics.add("645213");
//        monthStatistics.add("82");
//        monthStatistics.add("9.6%");
        List<StatisticsEntity> list = new ArrayList<StatisticsEntity>();
        list.add(entity);
        json = gson.toJson(list);
        return json;
    }

    @RequestMapping(value = "/getStatisticTotal",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getStatisticTotal(){
        Gson gson = new Gson();
        StatisticsEntity entity = new StatisticsEntity(10236, 645213, 972, "9.5%");
//        List<String> totalStatistics = new ArrayList<String>();
//        totalStatistics.add("10236");
//        totalStatistics.add("645213");
//        totalStatistics.add("972");
//        totalStatistics.add("9.5%");
        List<StatisticsEntity> list = new ArrayList<StatisticsEntity>();
        list.add(entity);
        json = gson.toJson(list);
        return json;
    }


}
