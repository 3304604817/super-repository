<template>
  <div>
    <el-form ref="form" :model="form" label-width="80px">
      <el-row>
        <el-col :span="5" :offset="2">
          <el-form-item label="用户名">
            <el-input v-model="formInline.userName" placeholder="用户名"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="5">
          <el-form-item label="性别">
            <el-select v-model="formInline.sex" placeholder="性别">
              <el-option label="男" value="man"></el-option>
              <el-option label="女" value="woman"></el-option>
            </el-select>
          </el-form-item>
        </el-col>
        <el-col :span="5">
          <el-form-item label="用户级别">
            <el-select v-model="formInline.userLevel" placeholder="用户级别">
              <el-option label="高级VIP" value="highLevelVip"></el-option>
              <el-option label="VIP" value="vip"></el-option>
              <el-option label="游客" value="visitor"></el-option>
            </el-select>
          </el-form-item>
        </el-col>
      </el-row>
      <el-row>
        <el-col :span="6">
        </el-col>
        <el-col :span="6">
        </el-col>
        <el-col :span="6">
        </el-col>
        <el-col :span="6">
        </el-col>
      </el-row>
    </el-form>
  </div>
</template>

<style>
</style>

<script>
export default {
  data () {
    return {
      formInline: {
        userName: '',
        sex: '',
        userLevel: ''
      }
    }
  }
}
</script>
