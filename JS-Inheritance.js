var module = (function () {
    'use strict';
    var createBicyclePrototye = function () {
        return {
            speed: 0,
            applyBrake: function (brake) {
                this.speed += brake;
            },
            speedup: function (up) {
                this.speed += up;
            }
        };
    };

    var createMountainBikeProtoype = function (prototype) {
        var mountainBike = Object.create(prototype);
        mountainBike.gear = 1;
        mountainBike.setGear = function (gear) {
            mountainBike.gear = gear;
        };
        return mountainBike;
    };

    var start = function () {
        var bicyclePrototype = createBicyclePrototye();
        var mountainBikePrototype = createMountainBikeProtoype(bicyclePrototype);
        console.log(bicyclePrototype);
        console.log(mountainBikePrototype);

        var bicycle1 = Object.create(bicyclePrototype);
        console.log(bicycle1);

        var bicycle2 = Object.create(bicyclePrototype);
        console.log(bicycle2);

        var mountainBike1 = Object.create(bicyclePrototype);
        console.log(mountainBike1);

        var mountainBike2 = Object.create(bicyclePrototype);
        console.log(mountainBike2);

    };
    return {
        start: start
    };
})();

module.start();
console.log("-------------Using class :----------------");

class Bicycle {
    constructor() {
        this._speed = 0;
    }
    applyBrake(brake) {
        this._speed += brake;
    }
    speedup(up) {
        this._speed += up;
    }
}

class MountainBike extends Bicycle {
    constructor() {
        super();
        this._gear = 1;
    }
    setGear(gear) {
        this._gear = gear;
    }
}

var bicycle1 = new Bicycle();
var bicycle2 = new Bicycle();
var mountainBike1 = new MountainBike();
var mountainBike2 = new MountainBike();
console.log(bicycle1);
console.log(bicycle2);
console.log(mountainBike1);
console.log(mountainBike2);

console.log("-------------Using constructor function :----------------");

function BicycleFunction() {
    this._speed = 0;
}

BicycleFunction.prototype.applyBrake = function (brake) {
    this._speed += brake;
};

BicycleFunction.prototype.speedup = function (up) {
    this._speed += up;
};

function MountainBikeFunction() {
    BicycleFunction.call(this);
    this._gear = 1;
}

MountainBikeFunction.prototype.setGear = function (gear) {
    this._gear = gear;
};

var bicycle1 = new BicycleFunction();
var bicycle2 = new BicycleFunction();
var mountainBike1 = new MountainBikeFunction();
var mountainBike2 = new MountainBikeFunction();
console.log(bicycle1);
console.log(bicycle2);
console.log(mountainBike1);
console.log(mountainBike2);
