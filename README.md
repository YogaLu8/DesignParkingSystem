# 1603. 设计停车系统（简单）

> 力扣（LeetCode）第 1603 题：https://leetcode.cn/problems/design-parking-system/
> 本作业为《面向对象程序设计（Java）》课程作业，通过 Git 提交，GitHub Actions 自动评分（10 个测试用例，每题 1 分，共 10 分）。

## 题目描述

给一个停车场设计一个停车系统。停车场有**大、中、小**三种尺寸的停车位，每种尺寸的车位数量固定。

实现 `ParkingSystem` 类：

| 方法 | 说明 |
|------|------|
| `ParkingSystem(int big, int medium, int small)` | 构造器，三个参数分别对应大、中、小车位的数量 |
| `boolean addCar(int carType)` | 来了一辆 `carType` 类型的车（`1` = 大，`2` = 中，`3` = 小）。若该类型**仍有空位**，则停入（占用一个车位）并返回 `true`；否则返回 `false` |

## 示例

```java
ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
parkingSystem.addCar(1); // 返回 true  （大车位有 1 个空位）
parkingSystem.addCar(2); // 返回 true  （中车位有 1 个空位）
parkingSystem.addCar(3); // 返回 false （小车位有 0 个空位）
parkingSystem.addCar(1); // 返回 false （大车位已满，只有 1 个空位，已被占用）
```

## 约束

- `0 <= big, medium, small <= 1000`
- `carType` 取值为 1、2、3
- 最多会调用 `addCar` 1000 次

## 环境要求

- **JDK 21**（本课程统一使用 JDK 21；低于 21 将无法编译运行，可用 `java -version` 确认）
- Maven（项目已内置 `pom.xml`，用 IDEA 打开即可自动识别）
- Git（用于提交作业）

## 要求

1. 在 `src/main/java/ParkingSystem.java` 中补全实现，**不要修改类名与方法签名**。
2. 只修改本文件；`src/test` 目录不包含测试代码，10 个测试用例由评分系统在提交后自动注入并运行。

## 评分方式

- 使用 Classroom 50 内置自动评分（built-in autograder）：10 个测试用例（`ParkingSystemTest`）在评分时自动注入，每个用例 1 分，共 10 分。
- 每次 `git push` 后自动触发评分，结果发布在仓库 Releases（`submit/*`）与 Actions 中；成绩请在 Classroom 50 作业页查看。
