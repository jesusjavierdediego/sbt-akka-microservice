package com.hppoc.utils

//http://typesafehub.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html
import com.typesafe.config.ConfigFactory

trait ConfigHolder {
  //Loads a default configuration from "application.conf".
  //Use load(Config) if you don't want to use "application.conf".
  val config = ConfigFactory.load()
}
