/**
 * 力扣 1603. 设计停车系统（简单）
 * https://leetcode.cn/problems/design-parking-system/
 *
 * 停车场有三种车位（大/中/小），每种车位数量固定。
 * addCar(carType)：1=大 2=中 3=小，有剩余车位则停入并返回 true，否则 false。
 *
 * ===== 学生任务：在下方补全实现，不要修改类名与方法签名 =====
 * 提示：
 *   1. 用一个成员变量（如 int[] slots）记录三类车位的剩余数量；
 *   2. 构造器中用参数初始化各类型车位数量；
 *   3. addCar 中根据 carType 找到对应车位，剩余数量 > 0 则减一并返回 true。
 */
public class ParkingSystem {

    public ParkingSystem(int big, int medium, int small) {
        // TODO: 初始化大、中、小车位的数量
    }

    public boolean addCar(int carType) {
        // TODO: 有对应空位则停入（数量减一）并返回 true，否则返回 false
        return false;
    }
}
