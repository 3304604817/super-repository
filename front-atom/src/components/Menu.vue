<template>
  <div>
    <el-container style="height: 500px">
      <el-header>
        Atom Log
      </el-header>
      <el-container style="height: 500px">
        <el-aside style="width: 15%;">
          <el-menu>
            <el-submenu index="1">
              <template slot="title"><i class="el-icon-user"></i>个人信息</template>
              <el-menu-item-group>
                <el-menu-item @click.native="click_1_1(editableTabsValue)" index="1-1" >登录维护</el-menu-item>
                <el-menu-item @click.native="click_1_2()" index="1-2">信息维护</el-menu-item>
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
          <el-tabs v-model="editableTabsValue" type="card" closable @tab-remove="removeTab">
            <el-tab-pane
              v-for="(item) in editableTabs"
              :key="item.name"
              :label="item.title"
              :name="item.name"
            >
              {{item.content}}
            </el-tab-pane>
          </el-tabs>
        </el-main>
      </el-container>
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
    return {
      editableTabsValue: '0',
      editableTabs: [],
      tabIndex: 0
    }
  },
  methods: {
    removeTab (targetName) {
      let tabs = this.editableTabs
      let activeName = this.editableTabsValue
      if (activeName === targetName) {
        tabs.forEach((tab, index) => {
          if (tab.name === targetName) {
            let nextTab = tabs[index + 1] || tabs[index - 1]
            if (nextTab) {
              activeName = nextTab.name
            }
          }
        })
      }
      this.editableTabsValue = activeName
      this.editableTabs = tabs.filter(tab => tab.name !== targetName)
    },
    click_1_1 () {
      let newTabName = ++this.tabIndex + ''
      this.editableTabs.push({
        title: '登录信息维护',
        name: newTabName,
        content: 'New Tab content'
      })
      this.editableTabsValue = newTabName
    },
    click_1_2 () {
      console.log('1_2')
    }
  }
}
</script>
