package com.rays.ctl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.RoleDTO;
import com.rays.form.RoleForm;
import com.rays.service.RoleServiceInt;

/**
 * REST controller for managing Role operations.
 * <p>
 * This controller extends {@code BaseCtl} and provides REST endpoints
 * for performing CRUD operations on {@link RoleDTO} objects.
 * It also provides preload data required by the role form.
 * </p>
 *
 * @author Mehreen
 */
@RestController
@RequestMapping(value = "Role")
public class RoleCtl extends BaseCtl<RoleForm, RoleDTO, RoleServiceInt> {
	
	/**
	 * Loads the list of available roles.
	 *
	 * @return an {@link ORSResponse} containing the role list
	 */
	@GetMapping("preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		RoleDTO dto = new RoleDTO();
		//dto.setStatus(RoleDTO.ACTIVE);
		List<DropdownList> list = baseService.search(dto, userContext);
		res.addResult("roleList", list);
		return res;
	}

}