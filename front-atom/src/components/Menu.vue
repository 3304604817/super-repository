<template>
  <div>
    <el-container style="height: 100%; border: 1px">
      <el-header>
      </el-header>
      <el-aside style="width: 15%;">
        <el-menu>
          <el-submenu index="1">
            <template slot="title"><i class="el-icon-message"></i>个人信息</template>
            <el-menu-item-group>
              <el-menu-item index="1-1">登录维护</el-menu-item>
              <el-menu-item index="1-2">信息维护</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="2">
            <template slot="title"><i class="el-icon-message"></i>编辑模块</template>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title"><i class="el-icon-message"></i>开源模块</template>
          </el-submenu>
        </el-menu>
      </el-aside>
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
</style>

<script>
</script>
