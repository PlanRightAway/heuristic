package com.planit.heuristic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.planit.heuristic.service.HeuristificationService;
import com.planit.journey_common.endpoint.HeuristicController;
import com.planit.journey_common.model.PlanCriteria;
import com.planit.journey_common.model.RoutePointBean;

@RestController
public class HeuristicControllerImpl implements HeuristicController {
	
	@Autowired
	private HeuristificationService heuristificationService;

	public void registerPlan(Long planId, PlanCriteria planCriteria) {
		heuristificationService.registerPlan(planId, planCriteria);

	}

	public RoutePointBean heuristify(RoutePointBean routePointBean, Long planId) {
		return heuristificationService.heuristify(routePointBean, planId);
	}

}
