import {Component, OnInit} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable, of} from "rxjs";
import {User} from "../model/user.model";
import {catchError, tap} from "rxjs/operators";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  private userUrl = 'http://localhost:8080/index/user/luk';
  user: User[];
  constructor(
    private http: HttpClient,
  ) {
  }

  getUsers(): Observable<User[]> {
    const x = this.http.get<User[]>(this.userUrl).pipe(
      tap(_ => console.log('fetched users')),
      catchError(this.handleError<User[]>(`ups`))
    );

    x.subscribe((data: User[]) => {
      this.user = { ...data };
      console.log(this.user);
    });
    
    return x;
  }


  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      console.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  ngOnInit(): void {
  }


}
