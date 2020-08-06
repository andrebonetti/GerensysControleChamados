import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UtilService {

  constructor() { }

  newInstance(obj){
		if(!obj)
			return null;

		return JSON.parse(JSON.stringify(obj));
	}
}
