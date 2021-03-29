package com.guofen.controller.cylj;

import com.guofen.pojo.KitchenwasteExport;
import com.guofen.service.cylj.KitchenwasteExportService;
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
@Api("厨余垃圾黑水虻就地处理站外销记录表")
public class KitchenwasteExportController {
    @Resource
    private KitchenwasteExportService kitchenwasteExportService;

    @ApiOperation("提交厨余垃圾黑水虻就地处理站外销记录")
    @PostMapping("/kitchenwaste/export/add")
    public boolean submitAllInfo(@RequestParam("exportDate") String exportDate, @RequestParam("insectExportWeight") String insectExportWeightstr,@RequestParam("insectDungExportWeight") String insectDungExportWeightstr,
                                 @RequestParam("companyName") String companyName,@RequestParam("contacter") String contacter,@RequestParam("telephone") String telephone,
                                 @RequestParam("yongfa") String yongfa,@RequestParam("feedback") String feedback,@RequestParam(value = "remark",defaultValue = "",required = false) String remark){
        Double insectExportWeight = Double.parseDouble(insectExportWeightstr);
        Double insectDungExportWeight = Double.parseDouble(insectDungExportWeightstr);
        return kitchenwasteExportService.submitAllInfo(new KitchenwasteExport(exportDate,insectExportWeight,insectDungExportWeight,companyName,contacter,telephone,yongfa,feedback,remark));
    }
    @ApiOperation("获取 当日 最新 一条记录")
    @GetMapping(value = "/kitchenwaste/export/getlast")
    public Result getlast(){
        return  ResultGenerator.genSuccessResult(kitchenwasteExportService.getlast());
    }
}
