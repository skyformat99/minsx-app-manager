/*
 *
 *  * Copyright © 2017-2018 minsx.com All rights reserved
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.minsx.appmanager.web.controller;

import com.minsx.appmanager.web.service.api.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @GetMapping(value = "/listApps")
    public ResponseEntity<?> listApps() {
        return applicationService.listApplications();
    }

    @GetMapping(value = "/getApp/{appName}")
    public ResponseEntity<?> getApp(@PathVariable String appName) {
        return applicationService.getApp(appName);
    }

    @GetMapping(value = "/startApp/{appName}")
    public ResponseEntity<?> startApp(@PathVariable String appName) {
        return applicationService.startApp(appName);
    }

    @GetMapping(value = "/reStartApp/{appName}")
    public ResponseEntity<?> reStartApp(@PathVariable String appName) {
        return applicationService.reStartApp(appName);
    }

    @GetMapping(value = "/stopApp/{appName}")
    public ResponseEntity<?> stopApp(@PathVariable String appName) {
        return applicationService.stopApp(appName);
    }

    @GetMapping(value = "/stopAllApps")
    public ResponseEntity<?> stopAllApps() {
        return applicationService.stopAllApps();
    }


}
