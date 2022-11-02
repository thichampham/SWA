import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: "/items/add",
    name: "add-item",
    component: () => import("./components/AddItem")
  },
  {
    path: "/",
    alias: "/items",
    name: "items",
    component: () => import("./components/ItemList")
  },
  {
    path: "/items/:id",
    name: "item-details",
    component: () => import("./components/Item")
  },
  {
    path: "/items/:id/edit",
    name: "edit-item",
    component: () => import("./components/EditItem")
  }
];


const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router

