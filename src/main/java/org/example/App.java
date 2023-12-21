package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Map<String, LightWeightCarConfiguration> configurationToItsName = new HashMap<>();
        setUpData(configurationToItsName);
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Available configurations: lowTier, mediumTier, mediumDieselTier, highTier\nEnter name to get more information: " );
        String userInputName = consoleScanner.nextLine();
        System.out.println("Configuration for entered name: " + configurationToItsName.getOrDefault(
                userInputName,
                LightWeightCarConfiguration.builder().withName("NOT FOUND").build()
        ));
    }

    private static void setUpData(Map<String, LightWeightCarConfiguration> configurationToItsName) {
        LightWeightCarConfiguration lowTier = LightWeightCarConfiguration.builder()
                .withEngineType(LightWeightCarConfiguration.EngineType.GAS)
                .withEngineCapacity(12)
                .withABS("abs 1")
                .withESP("esp 1")
                .withNumberOfSafetyPillows(2)
                .withHasOnBoardComputer(false)
                .withEnvironmentConditionControl(LightWeightCarConfiguration.EnvironmentConditionControl.CONDITIONER)
                .withInteriorTrim("cotton")
                .withName("lowTier")
                .withPrice(BigDecimal.valueOf(10000))
                .build();
        LightWeightCarConfiguration mediumTier = LightWeightCarConfiguration.builder()
                .withEngineType(LightWeightCarConfiguration.EngineType.GAS)
                .withEngineCapacity(16)
                .withABS("abs 2")
                .withESP("esp 2")
                .withNumberOfSafetyPillows(4)
                .withHasOnBoardComputer(true)
                .withEnvironmentConditionControl(LightWeightCarConfiguration.EnvironmentConditionControl.CONDITIONER)
                .withInteriorTrim("artificial leather")
                .withName("mediumTier")
                .withPrice(BigDecimal.valueOf(20000))
                .build();
        LightWeightCarConfiguration mediumDieselTier = LightWeightCarConfiguration.builder()
                .withEngineType(LightWeightCarConfiguration.EngineType.DIESEL)
                .withEngineCapacity(16)
                .withABS("abs 2")
                .withESP("esp 2")
                .withNumberOfSafetyPillows(4)
                .withHasOnBoardComputer(true)
                .withEnvironmentConditionControl(LightWeightCarConfiguration.EnvironmentConditionControl.CONDITIONER)
                .withInteriorTrim("artificial leather")
                .withName("mediumDieselTier")
                .withPrice(BigDecimal.valueOf(23000))
                .build();
        LightWeightCarConfiguration highTier = LightWeightCarConfiguration.builder()
                .withEngineType(LightWeightCarConfiguration.EngineType.GAS)
                .withEngineCapacity(18)
                .withABS("abs 3")
                .withESP("esp 3")
                .withNumberOfSafetyPillows(8)
                .withHasOnBoardComputer(true)
                .withEnvironmentConditionControl(LightWeightCarConfiguration.EnvironmentConditionControl.CLIMATE_CONTROL)
                .withInteriorTrim("natural leather")
                .withName("highTier")
                .withPrice(BigDecimal.valueOf(30000))
                .build();
        configurationToItsName.put("lowTier", lowTier);
        configurationToItsName.put("mediumTier", mediumTier);
        configurationToItsName.put("mediumDieselTier", mediumDieselTier);
        configurationToItsName.put("highTier", highTier);
    }
}
