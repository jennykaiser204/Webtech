<template>
  <div>
    <h1>Meine Tasks</h1>

    <ol>
      <li v-for="task in tasks" :key="task">
        {{ task }}
      </li>
    </ol>
  </div>
</template>

<script>
export default {
  data () {
    return {
      tasks: [
        'Hausaufgaben',
        'Vue lernen',
        'Projekt machen',
        'Einkaufen',
        'Workout'
      ]
    }
  }
}
</script>

<style>
div {
  border: solid black 1px;
  width: 80%;
  padding: 10px;
}

li {
  margin: 8px 0;
}
</style>
