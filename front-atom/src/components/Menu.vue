<template>
  <div>
    <el-container>
      <el-header>
      </el-header>
      <el-container style="height: 100%; border: 1px">
        <el-aside style="width: 15%;">
          <el-menu>
            <el-submenu index="1">
              <template slot="title"><i class="el-icon-user"></i>个人信息</template>
              <el-menu-item-group>
                <el-menu-item index="1-1">登录维护</el-menu-item>
                <el-menu-item index="1-2">信息维护</el-menu-item>
              </el-menu-item-group>
            </el-submenu>
            <el-submenu index="2">
              <template slot="title"><i class="el-icon-edit"></i>编辑模块</template>
              <el-menu-item-group>
                <el-menu-item index="2-1">计划管理</el-menu-item>
                <el-menu-item index="2-2">日记管理</el-menu-item>
              </el-menu-item-group>
            </el-submenu>
            <el-submenu index="3">
              <template slot="title"><i class="el-icon-share"></i>开源模块</template>
              <el-menu-item-group>
                <el-menu-item index="3-1">社区文化</el-menu-item>
                <el-menu-item index="3-2">开源日记</el-menu-item>
                <el-menu-item index="3-3">心的分享</el-menu-item>
              </el-menu-item-group>
            </el-submenu>
            <el-submenu index="4">
              <template slot="title"><i class="el-icon-phone-outline"></i>意见反馈</template>
              <el-menu-item-group>
                <el-menu-item index="4-1">功能反馈</el-menu-item>
                <el-menu-item index="4-2">技术意见</el-menu-item>
                <el-menu-item index="4-3">加入我们</el-menu-item>
              </el-menu-item-group>
            </el-submenu>
          </el-menu>
        </el-aside>

        <el-main>
          <el-table :data="tableData">
            <el-table-column prop="date" label="日期" width="140">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="120">
            </el-table-column>
            <el-table-column prop="address" label="地址">
            </el-table-column>
          </el-table>
        </el-main>
      </el-container>
      <el-footer>
      </el-footer>
    </el-container>
  </div>
</template>

<style>
  .el-header {
    background-color: #B3C0D1;
    color: #333;
    line-height: 60px;
  }

  .el-aside {
    color: #333;
  }

  .el-footer {
    background-color: #B3C0D1;
    color: #333;
    line-height: 60px;
  }
</style>

<script>
export default {
  data () {
    const item = {
      date: '2016-05-02',
      name: '王小虎',
      address: '上海市普陀区金沙江路 1518 弄'
    }
    return {
      tableData: Array(1).fill(item)
    }
  }
}
</script>
