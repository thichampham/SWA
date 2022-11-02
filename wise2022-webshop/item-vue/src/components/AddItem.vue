<template>
  <div class="submit-form">
    <div v-if="!submitted">
      <div class="form-group">
        <label for="title">Title</label>
        <input
          class="form-control"
          id="title"
          required
          v-model="item.title"
          name="title"
          type="text"
        />
      </div>
      <div class="form-group">
        <label for="description">Description</label>
        <input
          class="form-control"
          id="description"
          required
          v-model="item.description"
          name="description"
          type="text"
        />
      </div>
      <div class="form-group">
        <label for="price">Price</label>
        <input
          class="form-control"
          id="price"
          required
          v-model="item.price"
          name="price"
          type="text"
        />
      </div>
      <div class="form-group">
        <label for="availability">Availability</label>
        <input
          class="form-control"
          id="availability"
          required
          v-model="item.availability" 
          name="availability"
          type="text"
        />
      </div>

      <button @click="saveItem" class="btn btn-success">Submit</button>
      <p>{{ message }}</p>
    </div>

    <div v-else>
      <h4>You submitted successfully!</h4>
      <button class="btn btn-success" @click="newItem">Add</button>
    </div>
  </div>
</template>

<script>
import ItemDataService from "../services/ItemDataService";

export default {
  name: "add-item",
  data() {
    return {
      item: {
        id: null,
        title: "",
        description: "",
        price: "",
        availability: ""
      },
      submitted: false,
      message: ''
    };
  },
  methods: {
    saveItem() {
      var data = {
        title: this.item.title,
        description: this.item.description,
        price: this.item.price,
        availability: this.item.availability
      };
    ItemDataService.create(data)
        .then(response => {
          this.item.id = response.data.id;
          console.log(response.data);
          this.submitted = true;
        })
        .catch(e => {
          console.log(e);
          this.message = 'The item could not be added';
        });
    },
    
    newItem() {
      this.submitted = false;
      this.item = {};
    }
  }
};
</script>

<style>
.submit-form {
  max-width: 300px;
  margin: auto;
}
</style>