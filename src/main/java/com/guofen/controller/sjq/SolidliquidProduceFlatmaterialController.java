package com.guofen.controller.sjq;

import com.guofen.service.sjq.SolidliquidProduceFlatmaterialService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api("固液分离生产现场出渣记录表")
public class SolidliquidProduceFlatmaterialController {
    @Resource
    private SolidliquidProduceFlatmaterialService solidliquidProduceFlatmaterialService;

    @ApiOperation("添加固液分离生产现场出渣记录")
    @PostMapping("/sjq/solidliquidProduceFlatmaterial/add")
    public Result add(@RequestParam("date") String date,@RequestParam("updateTime") String updateTime,@RequestParam("sandOutput") String sandOutputstr,
                      @RequestParam("operator") String operator,@RequestParam(value = "remarks1",required = false) String remarks1){
        Double sandOutput = Double.parseDouble(sandOutputstr);
        if (solidliquidProduceFlatmaterialService.addForm(date,updateTime,sandOutput,operator,remarks1)){
            return ResultGenerator.genSuccessResult();
        }else {
            return ResultGenerator.genFailResult("保存失败");
        }
    }
    @ApiOperation("获取最新一条记录")
    @GetMapping("/sjq/solidliquidProduceFlatmaterial/getlast")
    public Result getlast(){
        return ResultGenerator.genSuccessResult(solidliquidProduceFlatmaterialService.findForm());
    }
    @ApiOperation("为最新记录添加检查人")
    @PostMapping("/sjq/solidliquidProduceFlatmaterial/update")
    public Result update(@RequestParam("inspector") String inspector,@RequestParam(value = "remarks2",required = false) String remarks2){
        if (solidliquidProduceFlatmaterialService.update(inspector, remarks2)){
            return ResultGenerator.genSuccessResult();
        }else {
            return ResultGenerator.genFailResult("检查人已存在");
        }
    }
}
