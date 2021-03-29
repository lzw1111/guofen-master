package com.guofen.controller.shlj;

import com.guofen.service.shlj.YijingStationSellingService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/shlj/yijingStationSelling")
@Controller
@Api(tags = "YijingStationSellingController", description = "易净场站回收物资外卖记录表")
public class YijingStationSellingController {

    @Autowired
    private YijingStationSellingService yijingStationSellingService;

    //保存
    @ApiOperation("添加记录")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@ApiParam(name="name",value="物品名称",required=true) @RequestParam String name,
                      @ApiParam(name="amountstr",value="数量",required=true) @RequestParam String amountstr,
                      @ApiParam(name="remarks",value="备注",required=true) @RequestParam String remarks){
        Double amount = Double.parseDouble(amountstr);
        if (yijingStationSellingService.add(name,amount,remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("获取 当日 最新 一条记录")
    @RequestMapping(value = "/getlast",method = RequestMethod.GET)
    @ResponseBody
    public Result get(){
        return  ResultGenerator.genSuccessResult(yijingStationSellingService.getlast());
    }
}
