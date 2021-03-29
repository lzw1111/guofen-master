package com.guofen.controller.sjq;

import com.guofen.service.sjq.DeodorizationCraftService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/sjq/deodorizationCraft")
@Controller
@Api(tags = "DeodorizationCraftController", description = "除臭工艺记录表")
public class DeodorizationCraftController {

    @Autowired
    private DeodorizationCraftService deodorizationCraftService;

    @ApiOperation("添加记录")
    @RequestMapping(value = "/addForm", method = RequestMethod.POST)
    @ResponseBody
    public Result addForm(@ApiParam(name = "dung_weight", value = "卸粪车间用量", required = true) @RequestParam String dung_weight,
                          @ApiParam(name = "solidliquid_weight", value = "固液分离系统用量", required = true) @RequestParam String solidliquid_weight,
                          @ApiParam(name = "flocculation_weight", value = "絮凝系统用量", required = true) @RequestParam String flocculation_weight,
                          @ApiParam(name = "compost_weight", value = "堆肥系统用量", required = true) @RequestParam String compost_weight,
                          @ApiParam(name = "outdoor_weight", value = "户外空间用量", required = true) @RequestParam String outdoor_weight,
                          @ApiParam(name = "enzyme_weight", value = "酵素", required = true) @RequestParam String enzyme_weight,
                          @ApiParam(name = "others_weight", value = "其他药剂", required = true) @RequestParam String others_weight,
                          @ApiParam(name = "remarks", value = "备注", required = false) @RequestParam String remarks){
        Double dungWeight = Double.parseDouble(dung_weight);
        Double solidliquidWeight = Double.parseDouble(solidliquid_weight);
        Double flocculationWeight = Double.parseDouble(flocculation_weight);
        Double compostWeight = Double.parseDouble(compost_weight);
        Double outdoorWeight = Double.parseDouble(outdoor_weight);
        Double enzymeWeight = Double.parseDouble(enzyme_weight);
        Double othersWeight = Double.parseDouble(others_weight);
        if (deodorizationCraftService.addForm(dungWeight, solidliquidWeight, flocculationWeight, compostWeight, outdoorWeight, enzymeWeight, othersWeight, remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("查询记录")
    @RequestMapping(value = "/findForm", method = RequestMethod.GET)
    @ResponseBody
    public Result findForm(){
        if (deodorizationCraftService.findForm() != null)
            return ResultGenerator.genSuccessResult(deodorizationCraftService.findForm());
        else
            return ResultGenerator.genFailResult("暂无记录");
    }
}
