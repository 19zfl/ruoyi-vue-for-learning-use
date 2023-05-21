import request from '@/utils/request'

// 查询学生列表-分数管理使用
export function toScoreStudentList() {
  return request({
    url: '/system/student/toScoreStudentList',
    method: 'get',
  })
}

// 查询学生列表
export function listStudent(query) {
  return request({
    url: '/system/student/list',
    method: 'get',
    params: query
  })
}

// 查询学生详细
export function getStudent(stuId) {
  return request({
    url: '/system/student/' + stuId,
    method: 'get'
  })
}

// 新增学生
export function addStudent(data) {
  return request({
    url: '/system/student',
    method: 'post',
    data: data
  })
}

// 修改学生
export function updateStudent(data) {
  return request({
    url: '/system/student',
    method: 'put',
    data: data
  })
}

// 删除学生
export function delStudent(stuId) {
  return request({
    url: '/system/student/' + stuId,
    method: 'delete'
  })
}
