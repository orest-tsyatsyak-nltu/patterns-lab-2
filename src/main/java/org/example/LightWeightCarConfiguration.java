package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LightWeightCarConfiguration {

    private EngineType engineType;

    private int engineCapacity;

    private String ABS;

    private String ESP;

    private int numberOfSafetyPillows;

    private boolean hasOnBoardComputer;

    private EnvironmentConditionControl environmentConditionControl;

    private String interiorTrim;

    private BigDecimal price;

    private String name;

    public static LightWeightCarConfigurationBuilder builder() {
        return new LightWeightCarConfigurationBuilder();
    }

    public enum EngineType {

        GAS, DIESEL

    }

    public enum EnvironmentConditionControl {

        CONDITIONER, CLIMATE_CONTROL

    }


    public static class LightWeightCarConfigurationBuilder {
        private EngineType engineType;
        private int engineCapacity;
        private String ABS;
        private String ESP;
        private int numberOfSafetyPillows;
        private boolean hasOnBoardComputer;
        private EnvironmentConditionControl environmentConditionControl;
        private String interiorTrim;
        private BigDecimal price;
        private String name;

        LightWeightCarConfigurationBuilder() {
        }

        public LightWeightCarConfigurationBuilder withEngineType(EngineType engineType) {
            this.engineType = engineType;
            return this;
        }

        public LightWeightCarConfigurationBuilder withEngineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public LightWeightCarConfigurationBuilder withABS(String ABS) {
            this.ABS = ABS;
            return this;
        }

        public LightWeightCarConfigurationBuilder withESP(String ESP) {
            this.ESP = ESP;
            return this;
        }

        public LightWeightCarConfigurationBuilder withNumberOfSafetyPillows(int numberOfSafetyPillows) {
            this.numberOfSafetyPillows = numberOfSafetyPillows;
            return this;
        }

        public LightWeightCarConfigurationBuilder withHasOnBoardComputer(boolean hasOnBoardComputer) {
            this.hasOnBoardComputer = hasOnBoardComputer;
            return this;
        }

        public LightWeightCarConfigurationBuilder withEnvironmentConditionControl(EnvironmentConditionControl environmentConditionControl) {
            this.environmentConditionControl = environmentConditionControl;
            return this;
        }

        public LightWeightCarConfigurationBuilder withInteriorTrim(String interiorTrim) {
            this.interiorTrim = interiorTrim;
            return this;
        }

        public LightWeightCarConfigurationBuilder withPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public LightWeightCarConfigurationBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public LightWeightCarConfiguration build() {
            return new LightWeightCarConfiguration(this.engineType, this.engineCapacity, this.ABS, this.ESP, this.numberOfSafetyPillows, this.hasOnBoardComputer, this.environmentConditionControl, this.interiorTrim, this.price, this.name);
        }
    }

}
