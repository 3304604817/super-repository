import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Menu from '@/components/Menu'

import Test from '@/views/test'
import Login from '@/views/login/index'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/menu',
      name: 'Menu',
      component: Menu
    },
    {
      path: '/test',
      name: 'Test',
      component: Test
    },
    {
      path: '/login/index',
      name: 'Login',
      component: Login
    }
  ]
})
