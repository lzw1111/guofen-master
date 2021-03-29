package com.guofen.controller.shlj;

import com.guofen.service.shlj.StorageBoxCleanService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestMapping("/shlj/storageBoxClean")
@Controller
@Api(tags = "StorageBoxCleanController", description = "可燃物储料箱、可腐物储料箱清运记录表")
public class StorageBoxCleanController {

    @Autowired
    private StorageBoxCleanService storageBoxCleanService;

    //保存
    @ApiOperation("添加记录")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@ApiParam(name="wagonNumber",value="车号",required=true) @RequestParam String wagonNumber,
                      @ApiParam(name="arrivalTime",value="来厂时间",required=true) @RequestParam String arrivalTime,
                      @ApiParam(name="leaveTime",value="离厂时间",required=true) @RequestParam String leaveTime,
                      @ApiParam(name="cleanWeightstr",value="清运物料重量",required=true) @RequestParam String cleanWeightstr,
                      @ApiParam(name="residueWeightstr",value="剩余物料重量",required=true) @RequestParam String residueWeightstr,
                      @ApiParam(name="cleanType",value="清运物料类型",required=true) @RequestParam String cleanType,
                      @ApiParam(name="residueType",value="剩余物料类型",required=true) @RequestParam String residueType,
                      @ApiParam(name="recordingPerson",value="记录人",required=true) @RequestParam String recordingPerson,
                      @ApiParam(name="remarks",value="备注",required=true) @RequestParam String remarks){
        Double cleanWeight = Double.parseDouble(cleanWeightstr);
        Double residueWeight = Double.parseDouble(residueWeightstr);
        if (storageBoxCleanService.add(wagonNumber,arrivalTime,leaveTime,cleanWeight,residueWeight,cleanType,residueType,recordingPerson,remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("获取 当日 最新 一条记录")
    @RequestMapping(value = "/getlast",method = RequestMethod.GET)
    @ResponseBody
    public Result get(){
        return  ResultGenerator.genSuccessResult(storageBoxCleanService.getlast());
    }
}
