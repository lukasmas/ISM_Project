import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {User} from "../model/user.model";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  @ViewChild('password', {static: false}) passwordInputRef: ElementRef;
  @ViewChild('email', {static: false}) emailInputRef: ElementRef;

  constructor() {
  }

  ngOnInit(): void {
  }

  onLogIn() {
    const u = new User(
      this.emailInputRef.nativeElement.value, "", "", "",
      this.passwordInputRef.nativeElement.value, 0, 0
    );
    console.log(u);
  }
}
