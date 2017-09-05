import { TestBed, async } from '@angular/core/testing';

import { AppComponent } from './app.component';
import { RouterTestingModule } from '@angular/router/testing'

describe('AppComponent', function(){
  beforeEach(async(function(){
    TestBed.configureTestingModule({
      imports: [
           RouterTestingModule                                   
        ],
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  }));

  it('Should run default test case',function(){
        console.log("Arkasss");
        expect(true).toBeTruthy;
    });
  it('should create the app', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  }));
});