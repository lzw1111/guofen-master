package com.guofen.controller.yf;

import com.guofen.pojo.RdFeed;
import com.guofen.service.yf.RdFeedService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api("研发进料表")
public class RdFeedController {
    @Resource
    private RdFeedService rdFeedService;

    @ApiOperation("提交进料数据现场记录")
    @PostMapping("/research/feed/add")
//    public boolean submitAllInfo(@RequestBody RdFeed rdFeed){
//        return rdFeedService.submitAllInfo(rdFeed);
//    }
    public boolean submitAllInfo(@RequestParam("feedDate") String feedDate,@RequestParam("crushStarttime") String crushStarttime,@RequestParam("crushEndtime") String crushEndtime,
                                 @RequestParam("mixStarttime") String mixStarttime,@RequestParam("mixEndtime") String mixEndtime,@RequestParam("feedStarttime") String feedStarttime,@RequestParam("feedEndtime") String feedEndtime,
                                 @RequestParam("deviceName") String deviceName,@RequestParam("batch") String batch,@RequestParam("zubie") int zubie,@RequestParam("boxNumber") int boxNumber,
                                 @RequestParam("feedWeight") double feedWeight,@RequestParam("insectResidusBoxWeight") double insectResidusBoxWeight,@RequestParam("boxWeight") double boxWeight,
                                 @RequestParam("recorder") String recorder,@RequestParam(value = "remark",defaultValue = "",required = false) String remark){
        return rdFeedService.submitAllInfo(new RdFeed(feedDate,crushStarttime,crushEndtime,mixStarttime,mixEndtime,feedStarttime,feedEndtime,deviceName,batch,zubie,boxNumber,feedWeight,insectResidusBoxWeight,boxWeight,recorder,remark));
    }
    @ApiOperation("获取 当日 最新 一条记录")
    @GetMapping(value = "/research/feed/getlast")
    public Result getlast(){
        return  ResultGenerator.genSuccessResult(rdFeedService.getlast());
    }
}