import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user';

const httpOptions = {
  headers: new HttpHeaders({'content-type': 'application/json'})
}
@Injectable({
  providedIn: 'root'
})
export class UserService {
  baseURL: string = 'http://localhost:3000';
  constructor(private http: HttpClient) {}

  getUsers():Observable<User[]> {
    return this.http.get<User[]>(this.baseURL + 'users');
  }

  addUser(user: any): Observable<User> {
    return this.http.post<User>(this.baseURL + 'users', user, httpOptions);
  }

  editUser(user: any): Observable<User> {
    let url:string = this.baseURL + 'users/' + user.id
    return this.http.post<User>(url + 'users', user, httpOptions);
  }

  deleteUser(user: any): Observable<User> {
    let url:string = this.baseURL + 'users/' + user.id
    return this.http.post<User>(url, httpOptions);
  }
}
