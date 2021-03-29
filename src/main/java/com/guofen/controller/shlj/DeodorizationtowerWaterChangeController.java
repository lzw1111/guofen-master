package com.guofen.controller.shlj;

import com.guofen.service.shlj.DeodorizationtowerWaterChangeService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/shlj/deodorizationtowerWaterChange")
@Controller
@Api(tags = "DeodorizationtowerWaterChangeController", description = "除臭塔换水记录")
public class DeodorizationtowerWaterChangeController {

    @Autowired
    private DeodorizationtowerWaterChangeService deodorizationtowerWaterChangeService;

    @ApiOperation("开始放水")
    @RequestMapping(value = "/beginReducingWater",method = RequestMethod.POST)
    @ResponseBody
    public Result beginFlowing(@ApiParam(name="water_reduce_time",value="放水时间",required=true) @RequestParam String water_reduce_time,
                               @ApiParam(name="recording_person",value="记录人",required=true) @RequestParam String recording_person){
        if (deodorizationtowerWaterChangeService.beginReducingWater(water_reduce_time, recording_person))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("开始加水")
    @RequestMapping(value = "/beginAddingWater",method = RequestMethod.POST)
    @ResponseBody
    public Result beginAddingWater(@ApiParam(name="water_add_time",value="加水时间",required=true) @RequestParam String water_add_time,
                                   @ApiParam(name="deodorantstr",value="添加除臭剂(kg)",required=true) @RequestParam String deodorantstr,
                                   @ApiParam(name="freshenerstr",value="添加清新剂(kg)",required=true) @RequestParam String freshenerstr){
        Double deodorant = Double.parseDouble(deodorantstr);
        Double freshener = Double.parseDouble(freshenerstr);
            if (deodorizationtowerWaterChangeService.beginAddingWater(water_add_time, deodorant, freshener))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("开始清理填料")
    @RequestMapping(value = "/beginCleaningStuffing",method = RequestMethod.POST)
    @ResponseBody
    public Result beginCleaningStuffing(@ApiParam(name="clean_filler_time",value="清理填料时间",required=true) @RequestParam String clean_filler_time,
                                        @ApiParam(name="clean_nozzle_numberstr",value="clean_nozzle_numberstr",required=true) @RequestParam String clean_nozzle_numberstr){
        Integer clean_nozzle_number = Integer.parseInt(clean_nozzle_numberstr);
        if (deodorizationtowerWaterChangeService.beginCleaningStuffing(clean_filler_time, clean_nozzle_number))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("保存备注")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@ApiParam(name="remarks",value="备注",required=false) @RequestParam String remarks){
        if (deodorizationtowerWaterChangeService.add(remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("查询记录")
    @RequestMapping(value = "/findForm",method = RequestMethod.GET)
    @ResponseBody
    public Result findForm(){
        if (deodorizationtowerWaterChangeService.findForm() != null)
            return ResultGenerator.genSuccessResult(deodorizationtowerWaterChangeService.findForm());
        else
            return ResultGenerator.genFailResult("暂无记录");
    }
}
