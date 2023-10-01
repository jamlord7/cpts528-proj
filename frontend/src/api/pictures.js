import {get,post} from './http'

export const getMyPictures=(pageParam)=>get('/pictures/',pageParam)
export const uploadPictures=(form)=>get('/pictures/upload', form)
export const updatePictures=(pictures)=>post('/pictures/update', pictures)
